package org.framework.bdd.steps;

import org.framework.bdd.models.Gadget;
import org.framework.bdd.utils.TestContext;

public abstract class AbstractSteps {

    protected Gadget getGadgetById(int id){
        return null;
    }

    protected TestContext getContext() {
        return TestContext.CONTEXT;
    }
}
