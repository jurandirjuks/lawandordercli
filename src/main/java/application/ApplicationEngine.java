package application;

import application.states.InitialState;

import java.io.*;


public class ApplicationEngine {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void start() throws IOException {

        System.out.println("Whats your name detective?");
        String name = br.readLine();
        User user = this.getUser(name);

        Context context = new ContextImpl();

        context.setUser(user);
        context.setState(new InitialState());

        do {
            this.mainLogic(context);
        } while (!context.goToNextSession());


        System.out.println("starting the case");
    }

    private void mainLogic(Context context) throws IOException {
        context.printStateOptions();
        String option = br.readLine();
        context.readOption(option);
    }

    private User getUser(String name) {
        return new User(name);
    }
}

/*

System.out.println("bla bla bla o caso começa assim e bla bla ");
            System.out.println("investigar o caso ou ir direto pro juri?");
            System.out.println("Investigando o caso");
            System.out.println("qual comodo vai ir?:");
            System.out.println("1 2 3 4 5 voltar ao inicio");
            System.out.println("investigação completa ir pro julgamento");
            System.out.println("");
            String option = br.readLine();



package com.mkyong.core;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBExample {
    public static void main(String[] args) {

      Customer customer = new Customer();
      customer.setId(100);
      customer.setName("mkyong");
      customer.setAge(29);

      try {

        File file = new File("C:\\file.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(customer, file);
        jaxbMarshaller.marshal(customer, System.out);

          } catch (JAXBException e) {
              e.printStackTrace();
          }

    }
}
 */