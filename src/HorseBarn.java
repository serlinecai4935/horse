import java.util.Arrays;

public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] horses)
    {
        int n = horses.length;
        spaces= new Horse[n];
        for (int i=0; i<n; i++)
        {
            spaces[i]=horses[i];
        }
    }

    public int findHorseSpace(String name)
    {
        for (int i=0; i<this.spaces.length; i++)
        {
            if (this.spaces[i]!=null && name.equals(this.spaces[i].getName()))
            {
                return i;
            }
        }
        return -1;
    }
    public void consolidate()
    {
        for (int i=0; i<this.spaces.length; i++)
        {
          if (this.spaces[i]!=null)
          {
              this.spaces[i]=this.spaces[i];
              this.spaces[i]=null;
              i= this.spaces.length;
          }
        }
    }
}
