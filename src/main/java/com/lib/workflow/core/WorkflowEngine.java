package com.lib.workflow.core;

import com.lib.workflow.core.deffinition.WorkflowDefinition;

public interface WorkflowEngine {

    void runEngine(WorkflowDefinition workflowDefinition);
}
