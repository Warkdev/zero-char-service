package eu.getmangos.dto;

import java.io.Serializable;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AiPlayerbotRandomBotsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "A unique identifier of the record")
    private Long id;

    @Schema(description = "The identifier of the owner. 0 indicates that this bot doesn't belong to any player.")
    private Long owner;

    @Schema(description = "The GUID of the bot.")
    private Long bot;

    @Schema(description = "The time since the last change for this bot. Always 0 at the INSERT time of this bot.")
    private Long time;

    @Schema(description = "The validity period of the BOT. He's considered not valid if the current time minus the time is greater or equals than this value.")
    private Long validin;

    @Schema(description = "The latest event which happened with this BOT.")
    private AiPlayerbotRandomBotEvent event;

    @Schema(description = "Indicates the validity of the event.")
    private boolean value;
}
