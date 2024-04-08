package in.landsellr.injava;

import java.util.List;

public class LandSellingMain {

	public static void main(String[] args) {
		LandDAO landDAO= new LandDAO();
		List<Land> lands= landDAO.getAllLands();
		System.out.println("List of Lands:");
		for(Land land: lands)
		{
			System.out.println("<p>"+land.getName()+","+land.getArea()+"Squre.ft., Rs"+land.getPrice()+"</p>");	
		}

	}

}
