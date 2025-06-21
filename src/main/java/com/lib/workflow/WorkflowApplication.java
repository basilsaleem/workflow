package com.lib.workflow;

import com.lib.workflow.core.WorkflowEngine;
import com.lib.workflow.core.deffinition.WorkflowDefinition;
import com.lib.workflow.core.loader.WorkflowYamlLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkflowApplication implements CommandLineRunner {

	@Autowired
	private WorkflowYamlLoader loader;

	@Autowired
	private WorkflowEngine engine;

	public static void main(String[] args) {
		SpringApplication.run(WorkflowApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		WorkflowDefinition definition = loader.loadWorkflow("sayHello");
		engine.runEngine(definition);
	}
}
