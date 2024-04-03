package com.epicode.U5D1.entities;

import com.epicode.U5D1.U5D1Application;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;
    @Autowired
    private Order order;

    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);
        Logger logger = ctx.getBean(Logger.class);

        menu.printMenu();
//      order.printOrder();
        logger.info("-----ORDER-----");
        logger.info("order number " + order.getNumber());
        logger.info("number of people " + order.getNumberOfPeople());
        logger.info("table " + order.getTable());
        logger.info("total " + order.getTotal());
    }
}
