import java.util.List;

public class Solution08 {
    public static void main(String[] args) {
        // https://developers.naver.com/docs/serviceapi/search/image/image.md#%EC%9D%B4%EB%AF%B8%EC%A7%80
        // 다운로드를 위해서 URL 리스트를 받음
        String keyword = "창억떡";
        List<String> urlList = getImageUrlList(keyword);
        System.out.println("urlList = " + urlList);
        // URL 리스트를 자체를 파일로 저장
        // 이미지를 파일 형태로 각각 다운로드
        // github actions를 사용해서 외부에서 다운로드 받을 수 있게
    }

    private static List<String> getImageUrlList(String keyword) {
        return List.of();
    }
}
