package com.javaex.Exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManager {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "person.txt";
	//개인정보 저장할 List <타입설정> PersonInfo 객체만
    private List<PersonInfo> InfoList = new ArrayList<PersonInfo>(); 
    //개인별 고유번호 
    private int id = 0;
    
    //?
    public List<PersonInfo> getInfoList(){
        return this.InfoList;
    }
    //?
    public void setInfoList(List<PersonInfo> InfoList) {
        this.InfoList = InfoList;
    }
    public int addInfo(PersonInfo personInfo) {
        //성공여부 return 변수
        int ret = 0;
 
        try {
            //id 지정 (personInfo)
            personInfo.setId(++this.id);
            
            //ArrayList에 객체를 추가 해 준다.
            this.InfoList.add(personInfo);
            
        }catch(Exception e) {
        	e.printStackTrace();
            //return값 변경(0 : 정상, 1 : 에러) 
            ret = 1;
        }
        
        return ret;
    }
    // MainApp에서 받아온 PN
    public int removeInfo(int PN) {
        //성공여부 return 변수
        int ret = 0;
        
        try {
            //List개수만큼 for문 순회
            for(int idx=0; idx < this.InfoList.size(); idx++) {
                PersonInfo tempPersonInfo = this.InfoList.get(idx);
 
                if(PN == tempPersonInfo.getId()) {
                    //id를 비교하여 같은 번호의 정보를 삭제한다.
                    this.InfoList.remove(idx);
                    break;
                }
                // ?
                if(idx == this.InfoList.size()-1) {
                    ret = 2;
                }
            }
        }catch(Exception e) {
        	e.printStackTrace();
            ret = 1;
        }
        
        return ret;
    }
    // MainApp에서 받아온 name
    public int SearchInfo(String name) {
        //성공여부 return 변수
        int ret = 0;
        Reader reader = null;
		Writer writer = null;
		
		// 보조 스트림
		BufferedReader br = null;
		BufferedWriter bw = null;
        try {
        	reader = new FileReader(source);
			br = new BufferedReader(reader);
			// 편의 기능으로 한줄 단위(개행된 문자열) 입출력 할수있다.
			String line = null;
			while((line = br.readLine()) != null) { // 더이상 읽을것이 없다면?
				if (line.contains(name)) { // name 포함된경우 출력
					System.out.println(line);
				}
			}
        }catch(Exception e) {
            e.printStackTrace();
            ret = 1;
        }finally {
        	try {
        		br.close();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }
        
        return ret;
    }
    public void showInfo() { // 1.리스트 출력
    	System.out.println("<1.리스트>");
        for(int idx=0; idx < this.InfoList.size(); idx++) {
            System.out.print(this.InfoList.get(idx).getId());
            System.out.print(". "+this.InfoList.get(idx).getName());
            System.out.print(" "+this.InfoList.get(idx).getPnum());
            System.out.print(" "+this.InfoList.get(idx).getHnum());
            System.out.println();
        }
    }
    
}
