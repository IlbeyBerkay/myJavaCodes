import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Chatbot extends JFrame {
    // The chatbot responds to user input and provides information about various activities and interests.
    private static final long serialVersionUID = 1L;
    private JTextArea ca = new JTextArea();
    private JTextField cf = new JTextField();
    private JButton b = new JButton();
    private JLabel l = new JLabel();
    private JButton quit = new JButton("Quit");

    public int random;

    Chatbot() {
        // Create the main JFrame for the Chatbot.
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(600, 400);
        f.getContentPane().setBackground(Color.blue);
        f.setTitle("ChatBot");
        f.add(ca);
        f.add(cf);
        f.add(quit);
        ca.setSize(583, 310);
        ca.setLocation(1, 1);
        ca.setBackground(Color.black);
        cf.setSize(300, 20);
        cf.setLocation(10, 320);
        // Add JButton for sending messages.
        f.add(b);
        l.setText("SEND");
        b.add(l);
        b.setSize(275, 20);
        b.setLocation(300, 320);
        // Add JButton for quitting the application.
        quit.setSize(135, 20);
        quit.setLocation(440, 340);
        AllActivities act = new AllActivities();
        School school = new School();
        Other other = new Other();
        Entertainment ent = new Entertainment();
        Food food = new Food();
        AreasOfInterest interest = new AreasOfInterest();
        JScrollPane scrollPane = new JScrollPane(ca);
        scrollPane.setSize(583, 310);
        scrollPane.setLocation(1, 1);
        f.add(scrollPane);



        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b) {                           // Message sents on Click button

                    String text = cf.getText().toLowerCase();
                    ca.setForeground(Color.GREEN);
                    ca.append("You: " + text + "\n");
                    cf.setText("");
                    // Handle greetings
                    if (text.contains("hi") || text.contains("hello")) {
                        random = (int) (Math.random() * 3 + 1);
                        if (random == 1) {
                            replyMeth("Hello.");
                            replyMeth("What do you want to know about me ");
                            makeYourChoice(text);
                    } else if (random == 2) {
                        replyMeth("Hi there.");
                        replyMeth("What do you want to know about me ");
                        makeYourChoice(text);

                    } else {
                        replyMeth("What's up ?");
                        replyMeth("What do you want to know about me ");
                        makeYourChoice(text);
                    }
                }  else if (text.contains("other")) {
                        // Handle inquiries about other activitie
                        replyMeth("There are three things that are different from my normal routine. " +
                                "These were travelling, visiting my relatives, visiting work and travel companies." +
                                " 0 = travel " +
                                " 1 = relatives " +
                                " 2 = WAT ");
                        String choiceString = JOptionPane.showInputDialog(null, "Enter your choice:");

                        try {
                            int choice = Integer.parseInt(choiceString);

                            switch (choice) {
                                case 0:
                                    replyMeth(other.travel());
                                    break;
                                case 1:
                                    replyMeth(other.visitRelatives());
                                    break;
                                case 2:
                                    replyMeth(other.meetWAT());
                                    break;
                                default:
                                    replyMeth("Invalid choice. Please enter 0, 1, or 2.");
                            }
                        } catch (NumberFormatException ef) {
                            replyMeth("Invalid input. Please enter a valid number.");
                        }


                    }  else if (text.contains("areas of interest")) {
                        // Handle inquiries about areas of interest

                        replyMeth("My interests are reading books , kickboxing and dancing. Which one would you like to know about? " +
                                " 2 = Kickboks " +
                                " 1 = Books " +
                                " 0 = Dance ");
                        String choiceString = JOptionPane.showInputDialog(null, "Enter your choice:");

                        try {
                            // Parse the user's choice input into an integer.

                            int choice = Integer.parseInt(choiceString);

                            switch (choice) {
                                case 0:
                                    replyMeth(interest.dance());
                                    break;
                                case 1:
                                    replyMeth(interest.read());
                                    break;
                                case 2:
                                    replyMeth(interest.practiceKickBoks());
                                    break;
                                default:
                                    replyMeth("Invalid choice. Please enter 0, 1, or 2.");
                            }
                        } catch (NumberFormatException ef) {
                            replyMeth("Invalid input. Please enter a valid number.");
                        }


                } else if (text.contains("food")) {
                        // Handle inquiries about food

                        replyMeth(" I usually eat two meals a day. My meals are  that " +food.haveDinner() + food.haveBreakfast() +
                                "Don't you ?");

                        String choiceString = JOptionPane.showInputDialog(null, "Enter your choice:");

                        try {
                            // Parse the user's choice input into an integer.

                            int choice = Integer.parseInt(choiceString);

                            switch (choice) {
                                case 0:
                                    replyMeth(" You don't eat at all. :) ");
                                    break;
                                case 1:
                                    replyMeth(" An eating style that I've heard a lot lately. ");
                                    break;
                                case 2:
                                    replyMeth(" Me too. ");
                                    break;
                                case 3:
                                    replyMeth(" Okey.It is usual. ");
                                    break;
                                default:
                                    replyMeth(" Invalid choice. Please enter 0, 1, or 2.");
                            }
                        } catch (NumberFormatException ef) {
                            // Handle the case where the user enters a non-numeric value.

                            replyMeth("Invalid input. Please enter a valid number.");
                        }


                } else if (text.contains("entertainment")) {
                        // Handle inquiries about entertainment

                        replyMeth("There are three activities for entertainment. Which one would you like to know about? " +
                                " 2 = Meet the ESN" +
                                " 1 = Surf the Net" +
                                " 0 = Birthday Party ");
                        String choiceString = JOptionPane.showInputDialog(null, "Enter your choice:");

                        try {
                            // Parse the user's choice input into an integer.

                            int choice = Integer.parseInt(choiceString);

                            switch (choice) {
                                case 0:
                                    replyMeth(ent.goToParty());
                                    break;
                                case 1:
                                    replyMeth(act.surfTheNet());
                                    replyMeth(ent.surfTheNet());
                                    break;
                                case 2:
                                    replyMeth(ent.meetTheEsn());
                                    break;
                                default:
                                    replyMeth(" Invalid choice. Please enter 0, 1, or 2. ");
                            }
                        } catch (NumberFormatException ef) {
                            // Handle the case where the user enters a non-numeric value.

                            replyMeth(" Invalid input. Please enter a valid number.");
                        }

                    } else if (text.contains("school")) {
                        // Handle inquiries about school

                        replyMeth("I have two school routines. Which one do you want to know?  " +
                                " 0 = School Schedule " +
                                " 1 = Library ");
                        String choiceString = JOptionPane.showInputDialog(null, "Enter your choice:");

                        try {
                            // Parse the user's choice input into an integer.

                            int choice = Integer.parseInt(choiceString);

                            switch (choice) {
                                case 0:
                                    replyMeth(school.goToSchool());
                                    break;
                                case 1:
                                    replyMeth(school.goToLibrary());
                                    break;
                                default:
                                    replyMeth(" Invalid choice. Please enter 0, 1, or 2.");
                            }
                        } catch (NumberFormatException ef) {
                            // Handle the case where the user enters a non-numeric value.

                            replyMeth(" Invalid input. Please enter a valid number.");
                        }

                    }else {
                        replyMeth("I do not understand");
                    }
                }

            }

        });

        quit.addActionListener(new ActionListener() {            // quit
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
    public void replyMeth(String s) {                          // Reply Method
        ca.append("ChatBot: " + s + "\n");
    }
     public void makeYourChoice(String text){
         replyMeth(" 1 = other " +
                 " 2 = Areas of interest " +
                 " 3 = Food " +
                 " 4 = Entertainment " +
                 " 5 = School ");
     }


}


