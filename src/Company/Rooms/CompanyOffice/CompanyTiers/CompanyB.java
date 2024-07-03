package Company.Rooms.CompanyOffice.CompanyTiers;

import Company.Employee.Employee;
import Company.Rooms.CompanyOffice.Clock;
import Company.Rooms.CompanyOffice.Company;
import Company.Rooms.CompanyOffice.Desk;
import Company.Rooms.CompanyOffice.FireExtinguisher;
import Company.Rooms.CompanyOffice.Frame;
import Company.Rooms.CompanyOffice.Plant;
import Company.Rooms.CompanyOffice.WaterFountain;
import java.util.ArrayList;
public class CompanyB extends Company
{
    public CompanyB(String companyName,String companyTier,int rent, 
    float levelUpPercent, float progress,int maxLevel,int currentLevel,int officeNumber,
    int fee, int rentIncrease, ArrayList<Desk> desks, ArrayList<Plant> plants,
    ArrayList<WaterFountain> waterFountain, ArrayList<FireExtinguisher> fireExtinguisher,
    ArrayList<Employee> employees, Clock clock, Frame frame)
    {
        super(companyName,"B",1500,levelUpPercent,progress,
        5,currentLevel,officeNumber,120000,200,
        desks,plants,waterFountain,fireExtinguisher,employees,clock,frame);
    }
    
}

