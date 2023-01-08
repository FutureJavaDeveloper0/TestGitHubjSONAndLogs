package com.company.TestLOGS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.trace("TraceLOGS<3");
        logger.debug("Change File!");
        logger.debug("Change File!");

        logger.error("FINALCOMMIT");
    }
}
