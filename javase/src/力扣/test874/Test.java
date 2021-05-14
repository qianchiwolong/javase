package 力扣.test874;

import java.util.HashSet;

/**
 * @Author 陈豪
 * @Date 2021/5/12 16:01
 * @Version 1.0
 */
/*
*
    -2 ：向左转 90 度
    -1 ：向右转 90 度
    1 <= x <= 9 ：向前移动 x 个单位长度

* */

public class Test {
    public int robotSim(int[] commands, int[][] obstacles) {
     /*    int x=0,y=0;
        int befordir=1;
        int direction=1;
        for (int command : commands) {
            if (command==-1||command==-2){
                befordir=direction;
                direction=nextdir(befordir,command);
                continue;
            }
            switch (direction){
                case 1: y+=command;break; //北
                case 2: y-=command;break;//南
                case 3: x+=command;break;//东
                case 4: x-=command;break;//西
            }
            for (int i = 0; i <obstacles.length ; i++) {
                if (x==obstacles[i][0]&&y==obstacles[i][1]){
                    if (befordir==1){
                        y-=1;
                    }
                    if (befordir==2){
                        y+=1;
                    }
                    if (befordir==3){
                        x-=1;
                    }
                    if (befordir==4){
                        x+=1;
                    }
                }

            }
        }

        return x*x+y*y;*/
        int[] dir_x = {0, 1, 0, -1};
        int[] dir_y = {1, 0, -1, 0};
        int x = 0;
        int y = 0;
        //0,1,2,3分别代表北、东、南、西方向，初始为正北方；
        int status = 0;
        int max_distance = 0;
        //判断障碍物：将障碍物的x和y坐标组合成一个字符串用set保存障碍物，查找的时候只要判断当前坐标组成的串是否在set里即可。
        HashSet<String> blockSet = new HashSet<>();
        for (int i = 0; i < obstacles.length; i++) {
            blockSet.add(obstacles[i][0] + "," + obstacles[i][1]);
        }
        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == -1){
                status += 1;
            }
            if (commands[i] == -2){
                status += 3;
            }
            if (commands[i] > 0){
                for (int j = 0; j < commands[i]; j++) {
                    int next_x = x + dir_x[status % 4];
                    int next_y = y + dir_y[status % 4];
                    if (blockSet.contains(next_x + "," + next_y)){
                        break;
                    }else {
                        x = next_x;
                        y = next_y;
                        max_distance = Math.max(max_distance, x*x+y*y);
                    }
                }
            }
        }
        return max_distance;

    }

    private int nextdir(int befordir,int commands){
        if (befordir==1&&commands==-1) return 3;
        if (befordir==2&&commands==-1) return 4;
        if (befordir==3&&commands==-1) return 2;
        if (befordir==4&&commands==-1) return 1;
        if (befordir==1&&commands==-2) return 4;
        if (befordir==2&&commands==-2) return 3;
        if (befordir==3&&commands==-2) return 1;
        if (befordir==4&&commands==-2) return 2;
        return 0;
    }

    public static void main(String[] args) {
        Test test=new Test();
        int[] a={4,-1,3};
        int[] b={4,-1,4,-2,4};
        int[][] lj={{2,4}};
        int i = test.robotSim(b, lj);
        System.out.println(i);

    }
}
