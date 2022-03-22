package ph.com.usegutierrez.simplespringwebflow.spring;

import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.webflow.config.AbstractFlowConfiguration;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;
import org.springframework.webflow.engine.builder.support.FlowBuilderServices;
import org.springframework.webflow.executor.FlowExecutor;
import org.springframework.webflow.mvc.builder.MvcViewFactoryCreator;
import org.springframework.webflow.mvc.servlet.FlowHandlerAdapter;
import org.springframework.webflow.mvc.servlet.FlowHandlerMapping;

@Configuration
public class WebFlowConfig extends AbstractFlowConfiguration {

  @Autowired
  private WebMvcConfig webMvcConfig;

  @Bean
  public FlowDefinitionRegistry flowRegistry() {
    return getFlowDefinitionRegistryBuilder() //
        .setBasePath("classpath:flows") //
        .addFlowLocationPattern("/**/*-flow.xml") //
        .setFlowBuilderServices(this.flowBuilderServices()) //
        .build();
  }

  @Bean
  public FlowExecutor flowExecutor() {
    return getFlowExecutorBuilder(flowRegistry()).build();
  }

  @Bean
  public FlowBuilderServices flowBuilderServices() {
    return getFlowBuilderServicesBuilder()
        .setViewFactoryCreator(mvcViewFactoryCreator())
        .setDevelopmentMode(true).build();
  }

  @Bean
  public FlowHandlerMapping flowHandlerMapping() {
    FlowHandlerMapping handlerMapping = new FlowHandlerMapping();
    handlerMapping.setOrder(-1);
    handlerMapping.setFlowRegistry(flowRegistry());
    return handlerMapping;
  }

  @Bean
  public FlowHandlerAdapter flowHandlerAdapter() {
    FlowHandlerAdapter handlerAdapter = new FlowHandlerAdapter();
    handlerAdapter.setFlowExecutor(flowExecutor());
    handlerAdapter.setSaveOutputToFlashScopeOnRedirect(true);
    return handlerAdapter;
  }


  @Bean
  public MvcViewFactoryCreator mvcViewFactoryCreator() {
    MvcViewFactoryCreator factoryCreator = new MvcViewFactoryCreator();
    factoryCreator.setViewResolvers(Collections.singletonList(webMvcConfig.viewResolver()));
    factoryCreator.setUseSpringBeanBinding(true);
    return factoryCreator;
  }


}
