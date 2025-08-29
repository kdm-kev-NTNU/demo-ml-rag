package demo.ml.rag.services;

import demo.ml.rag.model.Answer;
import demo.ml.rag.model.Question;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface OpenAIService {

    Answer getAnswer(Question question);
}
