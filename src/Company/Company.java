package Company;

import java.util.ArrayList;

import Company.Employee.Employee;
import Company.OfficeFurniture.OfficeFurniture;

public class Company
{
    private String companyName;
    private String companyTier;
    private int rent;
    private float levelUpPercent;
    private float progress;
    private int maxLevel;
    private int currentLevel;
    private int rentIncrease;
    private int officeNumber;
    private int fee;
    private ArrayList<OfficeFurniture> desks;
    private ArrayList<OfficeFurniture> plants;
    private ArrayList<OfficeFurniture> waterFountain;
    private ArrayList<OfficeFurniture> fireExtinguisher;
    private ArrayList<Employee> employees;
    private Clock clock;
    private Frame frame;

    public Company(String companyName,String companyTier,int rent, 
        float levelUpPercent, float progress,int maxLevel,int currentLevel,int officeNumber,
        int fee, int rentIncrease, ArrayList<OfficeFurniture> desks, ArrayList<OfficeFurniture> plants,
        ArrayList<OfficeFurniture> waterFountain, ArrayList<OfficeFurniture> fireExtinguisher,
        ArrayList<Employee> employees, Clock clock, Frame frame)
    {
        this.companyName=companyName;
        this.companyTier=companyTier;
        this.rent=rent;
        this.levelUpPercent=levelUpPercent;
        this.progress=progress;
        this.maxLevel=maxLevel;
        this.currentLevel=currentLevel;
        this.rentIncrease=rentIncrease;
        this.officeNumber=officeNumber;
        this.fee=fee;
        this.desks=desks;
        this.plants=plants;
        this.waterFountain=waterFountain;
        this.fireExtinguisher=fireExtinguisher;
        this.employees=employees;
        this.clock=clock;
        this.frame=frame;
    }

    
}
