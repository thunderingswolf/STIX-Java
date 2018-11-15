package io.digitalstate.stix.sdo;

import io.digitalstate.stix.sdo.impl.types.KillChainPhase;

import java.util.List;

public interface AttackPattern extends CommonProperties {
    public String getName();
    public void setName(String name);

    public String getDescription();
    public void setDescription(String description);

    public List<KillChainPhase> getKillChainPhases();
    public void setKillChainPhases(List<KillChainPhase> killChainPhases);
}
