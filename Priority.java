package chapter_09;

public interface Priority {
	public class HW4_2 implements Priority, Comparable<HW4_2> {
	    private String msg;
	    private int num;



	    public HW4_2( int num) {
	        this.num = num;
	        setPriority(num);
	    }

	    public void setPriority(int level) {
	        this.num = level;

	        if (level == 1)
	            msg = "EXTREMELY CRITICAL";
	        if (level == 2)
	            msg = "Serious";
	        if (level == 3)
	            msg = "Issues";
	        if (level == 4)
	            msg = "Normal";
	        if (level == 5)
	            msg = "No Issues";
	    }

	    public int getPriority() {
	        return num;
	    }

	    public String toString() {
	        return  "Numeric Priority: " + "\t" + num + "\t" + "\t" + msg;
	    }




	    public int compareTo(HW4_2 o) {
	        if (this.num > o.num)
	            return 1;
	        else if (this.num < o.num)
	            return -1;
	        else
	            return 0;
	    }
	}

}
