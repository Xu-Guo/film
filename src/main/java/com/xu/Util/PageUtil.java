package com.xu.Util;

public class PageUtil {

	public static String genPagination(String targetUrl,long totalNum,int currentPage,int pageSize){
		long totalPage=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
		if(totalPage==0){
			return "Data not found";
		}else{
			StringBuffer pageCode=new StringBuffer();
			pageCode.append("<li><a href='"+targetUrl+"/1'>Home</a></li>");
			if(currentPage>1){
				pageCode.append("<li><a href='"+targetUrl+"/"+(currentPage-1)+"'>Prev</a></li>");
			}else{
				pageCode.append("<li class='disabled'><a href='#'>Prev</a></li>");
			}
			for(int i=currentPage-2;i<=currentPage+2;i++){
				if(i<1||i>totalPage){
					continue;
				}
				if(i==currentPage){
					pageCode.append("<li class='active'><a href='"+targetUrl+"/"+i+"'>"+i+"</a></li>");	
				}else{
					pageCode.append("<li><a href='"+targetUrl+"/"+i+"'>"+i+"</a></li>");	
				}
			}
			if(currentPage<totalPage){
				pageCode.append("<li><a href='"+targetUrl+"/"+(currentPage+1)+"'>Next</a></li>");
			}else{
				pageCode.append("<li class='disabled'><a href='#'>Next</a></li>");
			}
			pageCode.append("<li><a href='"+targetUrl+"/"+totalPage+"'>Last</a></li>");
			return pageCode.toString();
		}
	}
	

	
	
}
