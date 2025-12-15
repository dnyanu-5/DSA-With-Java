import java.util.ArrayList;
import java.util.Collections;

public class JobSequence {

    static class jobs {
        int deadline;
        int profit;
        int idx;

        public jobs(int i, int d, int p) {
            this.idx = i;
            this.deadline = d;
            this.profit = p;
        }
    }

    public static void main(String[] args) {

        int jobinfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        
        ArrayList<jobs> job = new ArrayList<>();
        for (int i = 0; i < jobinfo.length; i++) {
            job.add(new jobs(i, jobinfo[i][0], jobinfo[i][1]));
        }

        Collections.sort(job, (ob1, ob2) -> ob2.profit - ob1.profit);

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for (int i = 0; i < job.size(); i++) {
            jobs curr = job.get(i);
            if (curr.deadline > time) {
                time++;
                seq.add(curr.idx);
            }
        }
        System.out.println("Maximum jobs are="+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i)+" ");
        }

    }

}
