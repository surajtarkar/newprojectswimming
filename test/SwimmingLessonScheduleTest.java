import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SwimmingLessonScheduleTest {
    private SwimmingLessonSchedule schedule;

    @Before
    public void setUp() {
        schedule = new SwimmingLessonSchedule();
    }

    @Test
    public void testBookLesson() {

        Learner learner = new Learner("John", "Male", 10, "123456789", "Grade 1");


        assertTrue(schedule.bookLesson("Monday", "4-5pm", "Grade 1", learner));
    }

    @Test
    public void testCancelLesson() {

        Learner learner = new Learner("Jane", "Female", 8, "987654321", "Grade 2");


        schedule.bookLesson("Monday", "4-5pm", "Grade 2", learner);


        assertTrue(schedule.cancelLesson(learner.getBookingID()));
    }

    @Test
    public void testAttendLesson() {

        Learner learner = new Learner("Alice", "Female", 9, "111222333", "Grade 3");


        schedule.bookLesson("Wednesday", "5-6pm", "Grade 3", learner);


        assertTrue(schedule.attendLesson(learner.getBookingID(), "Great lesson!", 5));
    }



    @Test
    public void testGenerateMonthlyLearnerReport() {

        schedule.generateMonthlyLearnerReport(1);
    }

    @Test
    public void testGenerateMonthlyCoachReport() {

        schedule.generateMonthlyCoachReport(1);
    }


}
