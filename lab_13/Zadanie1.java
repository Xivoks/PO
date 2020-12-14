import java.util.Objects;
class Zadanie1 implements Comparable
{
    private int    priority;
    private String description;

    public Zadanie1()
    {
        priority = 0;
        description = "";
    }

    public Zadanie1(int priority, String description)
    {
        this.priority    = priority;
        this.description = description;
    }

    public int getPriority ()
    {
        return priority;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setPriority (int priority)
    {
        this.priority    = priority;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Zadanie1 zadania = (Zadanie1) o;
        return Objects.equals(priority,zadania.priority);
    }
    @Override
    public int compareTo (Object obj)
    {
        int result = -1;

        if (obj == null)
        {
            result = -1;
        }

        else if (this == obj)
        {
            result = 0;
        }

        else if (obj instanceof Zadanie1)
        {
            Zadanie1 objZadanie1 = (Zadanie1) obj;

            if (getPriority() < objZadanie1.getPriority())
                return -1;  // The prioroty for this < obj
            else if (getPriority() == objZadanie1.getPriority())
                return 0;  // The prioroty for this == obj
            else
                return 1;  // The prioroty for this > obj
        }

        return result;
    }

    @Override
    public String toString()
    {
        return priority + "\t" + description;
    }
}
