package eu.getmangos.mapper;

import org.mapstruct.Mapper;

import eu.getmangos.dto.BugReportDTO;
import eu.getmangos.entities.Bugreport;

@Mapper(componentModel = "cdi")
public interface BugReportMapper {

    BugReportDTO map(Bugreport auction);

    Bugreport map(BugReportDTO dto);
}
