package com.lib.workflow.core.engine;

import com.lib.workflow.core.WorkflowEngine;
import com.lib.workflow.core.deffinition.WorkflowDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class WorkflowEngineImpl implements WorkflowEngine {

    private ApplicationContext context;

    public WorkflowEngineImpl(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void runEngine(WorkflowDefinition workflowDefinition) {
        // Logic to start the workflow engine
        System.out.println("Workflow Engine started successfully.");

        // You can access beans from the application context if needed
        // Example: WorkflowExecutionHandler handler = context.getBean(WorkflowExecutionHandler.class);
        // handler.handle("Engine started");
    }
}
