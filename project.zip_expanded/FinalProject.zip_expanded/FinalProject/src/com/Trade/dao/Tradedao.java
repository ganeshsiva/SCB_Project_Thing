package com.Trade.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.Trade.Bean.Trade;
//import com.project2.bean.Athlete;
//import com.project2.bean.Athlete;
//import com.project2.bean.Athlete;
//import com.project2.dao.MyRowMapper;


@Repository("td")
public class Tradedao {	
@Autowired
JdbcTemplate jt;



	public int insertdata(Trade tt) {
		// TODO Auto-generated method stub
		
		return jt.update("insert into Trade values(?,?,?,?,?,?,?,?,?,?,?)",tt.getSNO(),tt.getFirstName(),tt.getLastName(),tt.getGender(),tt.getDOB(),tt.getAccount_Type(),tt.getId_Form(),tt.getBank_Branch(),tt.getTrade_price(),tt.getAadhar_number(),tt.getMobile_number());
		
		}
	
	public List<Trade> getTradeInfoDao()
	{
		return jt.query("select * from Trade", new MyRowMapper());
	}
	}
class MyRowMapper implements RowMapper<Trade>
{

	@Override
	public Trade mapRow(ResultSet arg0, int arg1) throws SQLException {
		Trade tt=new Trade();
		tt.setSNO(arg0.getInt(1));
        tt.setFirstName(arg0.getString(2));
          tt.setLastName(arg0.getString(3));
          tt.setGender(arg0.getString(4));
          tt.setDOB(arg0.getString(5));
          tt.setAccount_Type(arg0.getString(6));
          tt.setId_Form(arg0.getString(7));
          tt.setBank_Branch(arg0.getString(8));
          tt.setTrade_price(arg0.getInt(9));
          tt.setAadhar_number(arg0.getInt(10));
          tt.setMobile_number(arg0.getLong(11));
		
		
		return tt;
	}
	
}

