package io.peachapps.magnetized;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Magnetized.MODID)
public class Magnetized {
    public static final String MODID = "magnetized";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Magnetized() {
        LOGGER.debug("Loading Magnetized!");
    }
}
