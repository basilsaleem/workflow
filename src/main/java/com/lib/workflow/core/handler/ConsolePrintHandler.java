package com.lib.workflow.core.handler;

import com.lib.workflow.core.WorkflowExecutionHandler;
import org.springframework.stereotype.Component;

@Component
public class ConsolePrintHandler implements WorkflowExecutionHandler {

    @Override
    public void handle(String message) {
        System.out.println("Workflow Execution Message: " + message);
    }

    @Override
    public void handleFailure(String errorMessage) {
        System.err.println("Workflow Execution Error: " + errorMessage);
    }
}
