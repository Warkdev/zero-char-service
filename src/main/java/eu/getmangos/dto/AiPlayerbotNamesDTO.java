package eu.getmangos.dto;

import java.io.Serializable;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(hidden = true)
public class AiPlayerbotNamesDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "An unique identifier for this record")
    private Integer nameId;

    @Schema(description = "A possible name for a random player bot")
    private String name;

    /**@Schema(hidden = true)
    private Byte gender;

    @Schema(hidden = true)
    private Short race;

    @Schema(hidden = true)
    private Short className;

    @Schema(hidden = true)
    private Integer purpose;

    @Schema(hidden = true)
    private boolean priority;

    @Schema(hidden = true)
    private boolean inUse;*/
}
