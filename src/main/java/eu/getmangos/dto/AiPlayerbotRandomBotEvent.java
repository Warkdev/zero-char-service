package eu.getmangos.dto;

public enum AiPlayerbotRandomBotEvent {
    ADD("add"),
    RANDOMIZE("randomize"),
    LOGOUT("logout"),
    TELEPORT("teleport"),
    ONLINE("online"),
    DEAD("dead"),
    REVIVE("revive"),
    BUYMULTIPLIER("buymultiplier"),
    SELLMULTIPLIER("sellmultiplier"),
    LOOTAMOUNT("lootamount"),
    BOTCOUNT("bot_count");

    public final String event;

    private AiPlayerbotRandomBotEvent(String event){
        this.event = event;
    }

    public static AiPlayerbotRandomBotEvent convert(String event) {
        for(AiPlayerbotRandomBotEvent e : values()) {
            if(e.event.equals(event)) {
                return e;
            }
        }
        return null;
    }
}
