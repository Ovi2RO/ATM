package db.dao;

import db.hibernateUtil.HibernateUtil;
import db.model.Card;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class CardDao {

    public void addNewCard(Card card){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(card);
            transaction.commit();
        } catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }
    }

    public void deleteCard(String cardNumber){
        Transaction transaction = null;
        Card card = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            card = session.get(Card.class, cardNumber);
            session.delete(card);
            transaction.commit();
        } catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
        }
    }

    public String getCvv2 (String cardNumber){
        Transaction transaction = null;
        Card card = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            card = session.get(Card.class, cardNumber);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null){
                transaction.rollback();
            }
        }
        return card.getCvv2();
    }

    public Date getCardExpDate (String cardNumber){
        Transaction transaction = null;
        Card card = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            card = session.get(Card.class, cardNumber);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null){
                transaction.rollback();
            }
        }
        return card.getCardExpDate();
    }

    public Double getBalance (String cardNumber){
        Transaction transaction = null;
        Card card = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            card = session.get(Card.class, cardNumber);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null){
                transaction.rollback();
            }
        }
        return card.getBalance();
    }

    public String getFullName (String cardNumber){
        Transaction transaction = null;
        Card card = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            card = session.get(Card.class, cardNumber);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null){
                transaction.rollback();
            }
        }
        String fullName = card.getOwnerFirstName() + " " +card.getOwnerLastName();
        return fullName;
    }

    public void updateCard(Card card){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.saveOrUpdate(card);
            transaction.commit();
        } catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }
    }

    public Card getCardByCardNo(String cardNumber){
        Transaction transaction = null;
        Card card = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            card = session.get(Card.class, cardNumber);
            transaction.commit();
        } catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }
        return card;
    }

}
