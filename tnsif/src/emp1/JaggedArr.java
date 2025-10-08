package emp1;

public class JaggedArr {

	public static void main(String[] args) {
int[][] nums = new int[3][];  //represents of 3 rows but not fixed columns
		
		nums[0] = new int[5];
		nums[1] = new int[9];
		nums[2] = new int[2];
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				nums[i][j] = (int)(Math.random()*10);
			}
			
		}
		
		for(int n[] : nums)
		{
			for(int m : n)
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}

	}


	}


