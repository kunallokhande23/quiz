package com.example.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.data.RequestArray;
import com.example.data.Response;

@Service
public class BajajService {
	public Response prepareResponse(@RequestBody RequestArray arrayobj)
	{
		ArrayList<String> data = arrayobj.getData();
		
		ArrayList<String> numbers = new ArrayList<String>();
		ArrayList<String> alphabets = new ArrayList<String>();
		
		
			for(String str:data)
			{
				try {
					int n = Integer.parseInt(str);
					numbers.add(str);
				}
				catch(Exception e)
				{
					alphabets.add(str);
				}
		}
		return new Response(numbers,alphabets);
		
	}
}
