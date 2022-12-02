package com.RealParking.domain.repository;

import com.RealParking.domain.dto.IncidentDTO;


import java.util.List;
import java.util.Optional;


public interface IncidentRepository {

    List<IncidentDTO> getAll();
    Optional<List<IncidentDTO>> getByIncidentId(int incidenttId);
    Optional<IncidentDTO> getIncident(int incidentId);
    IncidentDTO save (IncidentDTO incident);
    IncidentDTO update(IncidentDTO incident);
    void delete(int incidentId);

}
