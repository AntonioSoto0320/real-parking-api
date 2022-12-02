package com.RealParking.domain.service;

import com.RealParking.domain.dto.IncidentDTO;
import com.RealParking.domain.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class Incident {
    private IncidentRepository incidentRepository;

    @Autowired
    public Incident(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    public List<IncidentDTO> getAll(){
        return incidentRepository.getAll();
    }

    public Optional<List<IncidentDTO>> getByIncidentId(int icidentId){
        return incidentRepository.getByIncidentId(icidentId);
    }

    public Optional<IncidentDTO> getIncident(int incidentId){
        return incidentRepository.getIncident(incidentId);
    }

    public IncidentDTO save (IncidentDTO incident){
        return incidentRepository.save(incident);
    }

    public IncidentDTO update(IncidentDTO incident){
        return incidentRepository.update(incident);
    }

    public void delete(int incidentId){
         incidentRepository.delete(incidentId);
    }

}
