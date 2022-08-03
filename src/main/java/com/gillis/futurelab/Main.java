package com.gillis.futurelab;

import com.gillis.futurelab.resource.CharacterResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Main extends Application<FutureLabConfig> {

    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public String getName() {
        return "future-lab";
    }

    @Override
    public void initialize(Bootstrap<FutureLabConfig> bootstrap) {
        //bundles?
    }

    @Override
    public void run(FutureLabConfig configuration, Environment environment) {

        //environment.healthChecks().register();
        //environment.admin().addTask(new EchoTask());
        //environment.jersey().register(DateRequiredFeature.class);
        environment.jersey().register(new CharacterResource());
    }

}
