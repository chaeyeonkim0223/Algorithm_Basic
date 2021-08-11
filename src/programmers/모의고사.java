package programmers;

import java.util.Arrays;
/*
 *    int[] hit = new int[3];
        for(int i = 0; i < hit.length; i++) {
            for(int j = 0; j < answers.length; j++) {
                if(patterns[i][j % patterns[i].length] == answers[j]) hit[i]++;
            }
        }

        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < hit.length; i++)
            if(max == hit[i]) list.add(i + 1);

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;
        return answer;
 */
public class 모의고사 {

	public static void main(String[] args) {
			int answers[] = {1,2,3,4,5};
			
		 	int[] one = {1,2,3,4,5};
	        int[] two = {2,1,2,3,2,4,2,5};
	        int[] three = {3,3,1,1,2,2,4,4,5,5};
	       
	        int[] people = new int[3];
	        // 답 맞은 갯수를 세준다.
	        for(int i=0; i<answers.length;i++){
	            if(one[i%5]==answers[i])people[0]++;
	            if(two[i%8]==answers[i])people[1]++;
	            if(three[i%10]==answers[i])people[2]++;
	        }
	        System.out.println(Arrays.toString(people));
	        People[] p = new People[3];
	        p[0] = new People(1,people[0]);
	        p[1] = new People(2,people[1]);
	        p[2] = new People(3,people[2]);
	        // 맞은 갯수를 오름차순으로 정렬한다.
	        Arrays.sort(p);
	        int cnt=1;
	        // 뒤에서부터 맞은갯수가 같은경우에만 cnt를 증가시킨다.
	        for(int i=p.length-1; i>=1; i--){
	            if(p[i].score==p[i-1].score)cnt++;
	            else break;
	        }
	        int answer[] = new int[cnt];
	        for(int i=0; i<cnt; i++){
	        
	            answer[i] = p[p.length-1-i].num;
	        }
	        Arrays.sort(answer);
	       // System.out.println(Arrays.toString(answer));
	    }
	    static class People implements Comparable<People> {
	        int num,score;
	        
	        public People(int num, int score){
	            this.num = num;
	            this.score = score;
	        }
	        @Override
	        public int compareTo(People o) {
	        return this.score - o.score;
	        
	    }
			@Override
			public String toString() {
				return "People [num=" + num + ", score=" + score + "]";
			}
	}

}
