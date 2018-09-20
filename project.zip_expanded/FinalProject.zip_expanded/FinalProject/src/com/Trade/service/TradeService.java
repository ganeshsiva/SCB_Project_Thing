package com.Trade.service;
//package csvreader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trade.Bean.Trade;
import com.Trade.dao.Tradedao;
//import com.project2.bean.Athlete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import com.scb.bean.log;
//import com.scb.dao.logindao;
import java.util.List;

@Service("Ts")
public class TradeService {

	@Autowired
	 Tradedao td;

		public void uploadcsv(Trade tt)
		{

	        String csvFile = "E:\\scb\\Report_final.csv";
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";

	        try {

	            br = new BufferedReader(new FileReader(csvFile));
	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] values = line.split(cvsSplitBy);

	               // System.out.println(values[0] + " " + values[1] + " "+ values[2]+ " "+ values[3]+ " "+ values[4]+ " "+ values[5]+ " "+ values[6]+ " "+ values[7]+ " "+ values[8]+ " "+ values[9]+ " "+ values[10]+ " ");
	              tt.setSNO(Integer.parseInt(values[0]));
	              tt.setFirstName(values[1]);
	                tt.setLastName(values[2]);
	                tt.setGender(values[3]);
	                tt.setDOB(values[4]);
	                tt.setAccount_Type(values[5]);
	                tt.setId_Form(values[6]);
	                tt.setBank_Branch(values[7]);
	                tt.setTrade_price(Integer.parseInt(values[8]));
	                tt.setAadhar_number(Integer.parseInt(values[9]));
	                tt.setMobile_number(Long.parseLong(values[10]));
	              System.out.println(tt.getFirstName());
	                System.out.println(tt.getLastName());
	               td.insertdata(tt);
	               
	                

	            }

	        } 
	       
	        catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	                
	            }
	            
	        }
	        
	   
	    }
		public int insertdata(Trade tt)
		{
			return td.insertdata(tt);
		}
		
		public List<Trade> getTradeInfo()
		{
			return td.getTradeInfoDao();
		}
}
