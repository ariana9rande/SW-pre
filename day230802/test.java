package day230802;

import java.util.ArrayList;

public class test
{
	public static void main(String[] args)
	{
//		String[] participant = {"kim", "lee", "park"};
//		String[] completion = {"lee", "park"};
		ArrayList<String> participant = new ArrayList<>();
		participant.add("kim");
		participant.add("lee");
		participant.add("kim");
		participant.add("park");
		
		ArrayList<String> completion = new ArrayList<>();
		completion.add("lee");
		completion.add("kim");
		completion.add("park");
		
		for(String s : solution(participant, completion))
			System.out.print("\"" + s + "\" ");
	}
	
	public static ArrayList<String> solution(ArrayList<String> participant, ArrayList<String> completion)
	{
		ArrayList<String> result = new ArrayList<>();
		
		int size_c = completion.size();
		
		for(int i = 0; i < participant.size(); i++)
		{
			for(int j = 0; j < size_c; j++)
			{
				//System.out.println("p : " + participant.get(i) + ", c : " + completion.get(j));
				if(participant.get(i) == completion.get(j))
				{
					completion.remove(j);
					size_c--;
					j--;
					i++;
				}
				else
				{
					result.add(participant.get(i));
					//System.out.println(participant.get(i) + " added");
					break;
				}
			}
		}
		return result;
	}
}
