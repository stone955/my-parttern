package com.stone.parttern.facade;

/**
 * 装修公司
 */
public class BuildHouseFacade {

    public void build() {
        Designer designer = new Designer();
        designer.work();

        Plumber plumber = new Plumber();
        plumber.work();

        CircuitWorker circuitWorker = new CircuitWorker();
        circuitWorker.work();

        Artist artist = new Artist();
        artist.work();
    }

}
