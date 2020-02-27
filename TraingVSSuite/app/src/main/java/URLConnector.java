import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;

public class URLConnector extends Thread{

    private String result;
    //http 요청 끝난 후 결과.
    private String URL;

    public URLConnector(String url){
        URL = url;
    }

    @Override
    public void run() {
        final String output = request(URL);
        result = output;
        //연결 끝난 URL = result 에 저장.
    }

    public String getResult() {
        return result;
    }

    public String request(String urlStr){
        StringBuilder output = new StringBuilder();
        //http 통신이라서 변경 가능한. 통신가능한 Serialize 클래스 상속한 StringBuilder 로 생성.
        try{
            URL url =new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            if(conn != null){
                conn.setConnectTimeout(10000);
                conn.setRequestMethod("GET");
                conn.setDoInput(true);
                conn.setDoOutput(true);

                int resCode = conn.getResponseCode();
                // 서버에 응답 요청 결과 받아옴.
                if(resCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));// ok 면 inputStream 에서 conn 받아오고, BufferReader에 올림.
                    String line = null;
                    while (true) {//true 인 동안. ok 인 동안, readLine 에 올리고, 없어질떄 break;
                        line = reader.readLine();
                        if (line == null) {
                            break; // 성공적으로 마침.
                        }
                        output.append(line + "|n");  // outpuot 에 append 해라.
                    }
                    // 연결 끝 --> close();
                    reader.close();
                    conn.disconnect();
                }
            }
        } catch (Exception ex){
            Log.e("SampleHTTP", "Exception in processing running",ex);
            ex.printStackTrace();
        }
    }
}
