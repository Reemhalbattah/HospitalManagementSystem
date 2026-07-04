package javafxproject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import javafxproject.ClinicGUI;

public class Main {

    static ArrayList<Clinic> List = new ArrayList<Clinic>();
    static ArrayList<Appointments> AppointmentList = new ArrayList<Appointments>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        fillList(List);
        int num = 0;
        System.out.println("----HOSPITAL SYSTEM ----");
        do {
            try {

                System.out.println("1-Display Clinics Info\n"
                        + "2- Book Appointment \n"
                        + "3-Cancel Appointment  \n"
                        + "4-Lab Test Cost\n"
                        + "5-GUI\n"
                        + "6-Read From Text File\n"
                        + "7-Write To Text File \n"
                        + "8-Exit");
                System.out.println("pick a number from the list: ");

                num = input.nextInt();

                switch (num) {
                    case 1:
                        for (Clinic j : List) {
                            System.out.println(j);
                            System.out.println("Consultation Charge is: " + j.ConsultationCharge());
                            System.out.println("---------------");
                            if (j instanceof SurgicalClinic) {
                                System.out.println("REQUIMENTS BEFORE SURGERY:");
                                ((SurgicalClinic) j).RequirmentsBeforeSurgery();
                                System.out.println();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Please Enter Patient Info: ");
                        input.nextLine();
                        System.out.print("Patient Full Name: ");
                        String FullName = input.nextLine();
                        System.out.print(" Patient Age: ");
                        int patientAge = input.nextInt();
                        System.out.print("Patient Gender: ");
                        String gender = input.next();
                        System.out.print("Patient Id: ");
                        int id = input.nextInt();
                        Patient p = new Patient(patientAge, gender, FullName, id);
                        System.out.println(""
                                + "1.Orthopedic Clinic\n"
                                + "2.Surgical Clinic\n "
                                + "3.Eyes Clinic \n");
                        System.out.print("Please Choose The Clinic Number: ");
                        int clinicNum = input.nextInt();
                        String clinicName = "";
                        if (clinicNum == 1) {
                            clinicName = "Orthopedic Clinc";
                        } else if (clinicNum == 2) {
                            clinicName = "Surgical Clinc";
                        } else if (clinicNum == 3) {
                            clinicName = "Eyes Clinc ";
                        } else {
                            System.out.println("Clinic Number " + clinicNum + " Is Not On The List");
                        }
                        System.out.println("Pick A Date For Your Appointment:");
                        System.out.print("Year:");
                        int year = input.nextInt();
                        System.out.print("Month: ");
                        int month = input.nextInt();
                        System.out.print("Day: ");
                        int day = input.nextInt();
                        System.out.print("Hour: ");
                        int Hour = input.nextInt();
                        DateTime date = new DateTime(year, month, day, Hour);
                        Appointments B = new Appointments(date, clinicName, p, false);
                        AppointmentList.add(B);
                        B.AppointmentBooking();
                        System.out.printf("Your Appointment Price Will Be: %.2f \n ", B.Calcable());
                        break;
                    case 3:
                        if (AppointmentList.isEmpty()) {
                            System.out.println("There Is No Appointments To Cancle");
                        } else {
                            System.out.println("Enter Your Id To Cancle");
                            int PersonId = input.nextInt();
                            for (Appointments L : AppointmentList) {
                                if (L.getPatient().getId() == PersonId) {
                                    L.CancelAppointmen();
                                } else {
                                    System.out.println("You Have Not Booked An Appointment Yet!");
                                }

                            }

                        }
                        break;
                    case 4:
                        double testPrice = 0;
                        System.out.println("1- Thyroid Stimulating Hormone Test\n 2-Vitamin Test");
                        System.out.println("Enter The Number Of The Test You Will Do: ");
                        int x = input.nextInt();
                        if (x == 1) {
                            testPrice = 240;
                            System.out.println("How Many Test You will Do?");
                            int testNumber = input.nextInt();
                            LabTestCost l = new LabTestCost(testPrice, testNumber);
                            System.out.print(" The Total Cost Will Be:" + l.Calcable());
                        } else if (x == 2) {
                            testPrice = 70;
                            System.out.println("How Many Test You will Do?");
                            int testNumber = input.nextInt();
                            LabTestCost l = new LabTestCost(testPrice, testNumber);
                            System.out.print(" The Total Cost Will Be:" + l.Calcable());
                        } else {
                            System.out.println("Invalid Number Please Choose from The List");
                        }

                        System.out.println();
                        break;
                        case 5: 
                        ClinicGUI.main(null); 
                        break;

                    case 6:
                        ReadText read = new ReadText();
                        read.openTextFile("ClinicInfo.txt");
                        read.readFromFile();
                        read.closeFile();
                        break;

                    case 7:
                        WriteText write = new WriteText();
                        write.openTextFile("ClinicInfo.txt");
                        if (List.isEmpty()) {
                            System.out.println("There Is No Clinics Yet!");
                        } else {
                            for (Clinic c : List) {
                                write.writeToFile(c);
                            }
                        }
                        write.closeFile();
                        System.out.println("All Clinics saved to the text file ClinicInfo");
                        break;
                    case 8:
                        System.out.println("Thank You For Using Our Hospital System !");
                        break;

                    default:
                        System.out.println(" Invalid!\n Please enter a number from the menu");

                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input " + e.getMessage());
                input.next();
            } catch (ClassCastException e) {
                System.err.println(e);
            } catch (NullPointerException e) {
                System.err.println(e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e);
            } catch (Exception e) {
                System.err.println(e);
            }

        } while (num != 9);

    }// end main

    public static void fillList(ArrayList<Clinic> List) {

        DateTime DateTime1 = new DateTime(2024, 4, 4, 1);
        DateTime DateTime2 = new DateTime(2024, 8, 26, 1);
        DateTime DateTime3 = new DateTime(2024, 5, 15, 1);

        Patient Patient1 = new Patient(22, "male", "Aouyb Hassan", 112233);
        Patient Patient2 = new Patient(30, "female", "Lama Abdullah Al-Omari", 11765);
        Patient Patient3 = new Patient(17, "male", "ahmed Khaled Al-Mutair ", 10329);

        Appointments objAppointment1 = new Appointments(DateTime1, "EyesClinic", Patient1, true);
        Appointments objAppointment2 = new Appointments(DateTime2, "SurgicalClinic", Patient2, true);
        Appointments objAppointment3 = new Appointments(DateTime3, "OrthoPedicClinc", Patient3, true);

        Appointments[] Doctor1Appointment = {objAppointment1};
        Appointments[] Doctor2Appointment = {objAppointment2};
        Appointments[] Doctor3Appointment = {objAppointment3};

        Doctor Doctorl = new Doctor(8, "ophthalmology", Doctor1Appointment, "Mustafa Ahmad", 44511);
        Doctor Doctor2 = new Doctor(10, "General Medicine", Doctor2Appointment, "Rasha Amr", 22456);
        Doctor Doctor3 = new Doctor(5, "OrthoPedic", Doctor3Appointment, "Ahmed hamad", 114628);

        
        Doctor[] orthopedicClincDoctor = {Doctorl};
        Doctor[] SurgicalClinicDoctor = {Doctor2};
        Doctor[] EyesClinicDoctor = {Doctor3};

        Clinic Clinic1 = new OrthoPedicClinc(true, true, 150, orthopedicClincDoctor);
        Clinic Clinic2 = new EyesClinic(true, true, EyesClinicDoctor);
        Clinic Clinic3 = new SurgicalClinic("DR.Ali Mohammed ", 4, SurgicalClinicDoctor);

        List.add(Clinic1);
        List.add(Clinic2);
        List.add(Clinic3);
    }
}
