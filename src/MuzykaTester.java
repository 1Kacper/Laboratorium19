import javax.sound.midi.*;

public class MuzykaTester {
    public void graj()
    {
        try
        {
            Sequencer sekwendser = MidiSystem.getSequencer();
        }
        catch (MidiUnavailableException ex)
        {
            System.out.println("Masz problem");
        }
    }

    public static void main(String[] args)
    {
        MuzykaTester m = new MuzykaTester();
        m.graj();
    }


}
