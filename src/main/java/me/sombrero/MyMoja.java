package me.sombrero;

/**
 * demo-annotation-processor2 프로젝트에서 만든 @Magic 애노테이션을 붙여주면
 * MagicMyMoja 라는 MyMoja 를 구현한 클래스를 만들어준다.
 */
/**
 * interface가 아닌 class로 변경하면 컴파일 에러가
 * 발생하는 것을 확인할 수 있다.
 */
@Magic
// public class MyMoja {
public interface MyMoja {

   String pullOut();

}
