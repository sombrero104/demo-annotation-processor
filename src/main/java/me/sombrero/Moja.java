package me.sombrero;

/**
 * demo-annotation-processor2 프로젝트에서 만든 @Magic 애노테이션을 붙여주면
 * MagicMoja 라는 Moja 를 구현한 클래스를 만들어준다.
 */
@Magic
public interface Moja {

    String pullOut();

}
