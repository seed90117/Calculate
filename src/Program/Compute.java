package Program;

import Interface.View;

public class Compute {

	static boolean type = false;
	static double ans=0;
	static String tmp1 = "",tmp2 ="",simple="";
	
	public static void buttonclick(String input)
	{
		if(input == "＋" || input == "−" || input == "×" || input == "÷" || input == "＝")
		{
			if(type)
			{
				switch(simple)
				{
				case "＋":
					ans = Double.parseDouble(tmp1)+Double.parseDouble(tmp2);
					break;
				case "−":
					ans = Double.parseDouble(tmp1)-Double.parseDouble(tmp2);
					break;
				case "×":
					ans = Double.parseDouble(tmp1)*Double.parseDouble(tmp2);
					break;
				case "÷":
					ans = Double.parseDouble(tmp1)/Double.parseDouble(tmp2);
					break;
				}
				View.output.setText(String.valueOf(ans));
				if(input == "＝")
				{
					type = false;
					tmp1 = tmp2 = "";
				}
				else
				{
					simple = input;
					tmp1 = String.valueOf(ans);
					tmp2 = "";
					
				}
			}
			else
			{
				simple = input;
				type = true;
				View.output.setText(String.valueOf(tmp1+simple));
			}
		}
		else
		{
			if(type)
			{
				tmp2 += input;
				View.output.setText(String.valueOf(tmp1+simple+tmp2));
			}
			else
			{
				tmp1 += input;
				View.output.setText(String.valueOf(tmp1));
			}
		}
	}
}
