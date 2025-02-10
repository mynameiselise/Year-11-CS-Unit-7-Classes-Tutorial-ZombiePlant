public class ZombiePlant {

    private int maximumPotency;
    private int remainingTreatments;

    public ZombiePlant(int potencyNeeded, int treatmentsNeeded){
        maximumPotency = potencyNeeded;
        remainingTreatments = treatmentsNeeded;
    }

    public int getPotency(){
        return maximumPotency;
    }

    public int treatmentsNeeded(){
        return remainingTreatments;
    }

    public boolean isDangerous(){
        if(remainingTreatments >=1){
            return true;
        }
        else{
            return false;
        }
    }

    public void treat(int specifiedPotency){
        if(specifiedPotency<=0){
            remainingTreatments = remainingTreatments;
        }
        else if(remainingTreatments==0) {
            remainingTreatments = remainingTreatments;
            if(specifiedPotency>maximumPotency){
                remainingTreatments++;
            }
        }
        else{
         if(specifiedPotency <= maximumPotency){
             remainingTreatments--;
            }
         else{
             remainingTreatments++;
         }
        }
    }
}
