package in.landsellr.injava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LandDAO {
	private Connection connection;
	public LandDAO()
	{
		try 
		{
			connection = DatabaseConnection.getConnection();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void addLand(Land land){
		try
		{
			String query = "INSERT INTO lands(name, area, price) VALUES(?, ?, ?)";
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setString(1, land.getName());
			ps.setDouble(2, land.getArea());
			ps.setDouble(3, land.getPrice());
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public List<Land> getAllLands()
	{
		List<Land> lands=new ArrayList<>();
		try
		{
			String query= "SELECT*FROM lands";
			PreparedStatement ps= connection.prepareStatement(query);
			ResultSet rs= ps.executeQuery();
			ps.close();
			while(rs.next())
			{
				Land land= new Land();
				land.setId(rs.getInt("id"));
				land.setName(rs.getString("name"));
				land.setArea(rs.getDouble("area"));
				land.setPrice(rs.getDouble("price"));
				lands.add(land);
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return lands;
	}
	public void updateLand(Land land)
	{
		try
		{
			String query="UPDATE lands SET name=?, area=?, price=? WHERE id=?";
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setString(1, land.getName());
			ps.setDouble(2, land.getArea());
			ps.setDouble(3, land.getPrice());
			ps.setInt(4, land.getId());
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public void deleteLand(int id)
	{
		try
		{
			String query="DELETE FROM lands WHERE id=?";
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
}
