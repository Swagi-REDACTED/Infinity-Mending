package net.blupillcosby.infinitymending;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfinityMending implements ModInitializer {
    public static final String MOD_ID = "infinity_mending";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Infinity Mending initialized!");
    }
}
