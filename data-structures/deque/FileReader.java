import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.html.HTMLDocument.Iterator;

public class FileReader {
	
	public FileReader(FileInputStream fis, DequeUsingStacks<String> deq) {
		String[] arr = new String[100];
		int count = 0;
		String newLine = System.getProperty("line.separator");
		BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
        StringBuilder out = new StringBuilder();
        String line;
        try {
			while ((line = reader.readLine()) != null) {
			    out.append(line + newLine);
			    arr[count] = line;
			    count++;
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}        
        
        try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // command interpreter
        int i = 0;
        
        while(arr[i]!=null){
        	
        	
        	if(arr[i].contains("size"))
        	{
        		System.out.println("The deque contains " + Integer.toString(deq.size()) + " string(s).");
        	}
        	
        	if(arr[i].equals("is_empty"))
        	{
        		if(deq.isEmpty()){
        			System.out.println("The deque is empty.");
        		}
        		else System.out.println("The deque is not empty.");
        	}
        	
        	if(arr[i].equals("first"))
        	{
        		if(deq.size()==0)
        		{
        			System.out.println("The deque was empty.");
        		}
        		else
        		{
        			System.out.println("The string at the front of the deque is " + deq.front.peek() + ".");
        		}
        	}
        	
        	if(arr[i].equals("last"))
        	{
        		if(deq.size()==0)
        		{
        			System.out.println("The deque was empty.");
        		}
        		else
        		{
        			System.out.println("The string at the back of the deque is " + deq.back.peek() + ".");
        		}
        	}
        	
        	if(arr[i].contains("add_first"))
        	{
        		String[] words=arr[i].split("\\s");
        		deq.front.push(words[1]);
        		System.out.println("Added the string " + words[1] + " to the front of the deque.");
        	}
        	
        	if(arr[i].contains("add_last"))
        	{
        		String[] words=arr[i].split("\\s");
        		deq.back.push(words[1]);
        		System.out.println("Added the string " + words[1] + " to the back of the deque.");
        	}
        	
        	if(arr[i].contains("remove_first"))
        	{
        		if(deq.isEmpty())
        		{
        			System.out.println("The deque was empty.");
        		}
        		else
        		{
        			System.out.println("Removed the string " + deq.front.pop() + " from the front of the deque.");
        		}
        	}
        	
        	if(arr[i].contains("remove_last"))
        	{
        		if(deq.isEmpty())
        		{
        			System.out.println("The deque was empty.");
        		}
        		else
        		{
        			System.out.println("Removed the string " + deq.back.pop() + " from the back of the deque.");
        		}
        	}
        	refresh:
        	i++;
        }
	}
}