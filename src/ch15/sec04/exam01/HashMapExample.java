package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap 생성
        Map<String, Integer> map = new HashMap<>();

        // 맵에 엔트리 추가
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); // 홍길동의 값을 95로 업데이트
        System.out.println("총 Entry 수: " + map.size()); // 현재 엔트리 수 출력
        System.out.println();

        // 특정 키의 값 가져오기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value); // 홍길동의 점수 출력
        System.out.println();

        // 키 세트를 가져와서 모든 키와 값을 출력
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator(); // 키를 순회할 이터레이터 생성
        while (keyIterator.hasNext()) {
            String k = keyIterator.next(); // 다음 키 가져오기
            Integer v = map.get(k); // 해당 키의 값 가져오기
            System.out.println(k + " : " + v); // 키와 값 출력
        }
        System.out.println();

        // 엔트리 세트를 가져와서 모든 키와 값을 출력
        Set<Entry<String, Integer>> entrySet = map.entrySet(); // 엔트리 세트 생성
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator(); // 엔트리를 순회할 이터레이터 생성
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next(); // 다음 엔트리 가져오기
            String k = entry.getKey(); // 엔트리의 키 가져오기
            Integer v = entry.getValue(); // 엔트리의 값 가져오기
            System.out.println(k + " : " + v); // 키와 값 출력
        }
        System.out.println();

        // 특정 키(홍길동) 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수: " + map.size()); // 삭제 후 엔트리 수 출력
        System.out.println();
    }
}
