package Exception;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class LateSubmissionException extends Exception {
    public LateSubmissionException(String message) {
        super(message);
    }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

class ExamSubmission {
    private static final LocalDateTime deadline = LocalDateTime.of(2025, 11, 7, 17, 0); 
    public void submitExam(String fileName, LocalDateTime submissionTime) throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.toLowerCase().endsWith(".pdf")) {
            throw new InvalidFileFormatException("Submission failed: invalid file format.");
        }

        if (submissionTime.isAfter(deadline)) {
            throw new LateSubmissionException("Submission failed: late submission.");
        }

        System.out.println("Exam submitted successfully at " + submissionTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
    }
}


public class online_exam{
    public static void main(String[] args) {
        ExamSubmission exam = new ExamSubmission();

        
        String fileName = "exam_answer.pdf";
        LocalDateTime submissionTime = LocalDateTime.of(2025, 11, 7, 16, 30); 

        try {
            exam.submitExam(fileName, submissionTime);
        } catch (LateSubmissionException | InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}


