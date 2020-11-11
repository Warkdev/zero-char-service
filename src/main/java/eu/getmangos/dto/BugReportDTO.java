package eu.getmangos.dto;

import java.io.Serializable;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BugReportDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "Auto generated value when records are inserted by the core.")
    private Integer id;

    @Schema(description = "The text description of the type of bug report / suggestion.")
    private String type;

    @Schema(description = "The text content of the bug/suggestion.")
    private String content;

}
