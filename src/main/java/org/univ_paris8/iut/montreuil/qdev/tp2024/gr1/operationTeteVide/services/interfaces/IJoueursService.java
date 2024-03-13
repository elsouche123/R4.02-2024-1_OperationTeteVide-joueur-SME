package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.entities.dto.JoueursDto;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles.ErreurSaisieException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utiles.PseudoExistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.AgeException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.CentresInteretsVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.ErreurChoixLangueException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.utils.Exceptions.PrenomException;

import java.util.List;

public interface IJoueursService {
    JoueursDto creerJoueur(String prenom, String pseudo, int age, List<String> centresInterets, String choixLangue) throws PseudoExistantException,
            AgeException, PrenomException, CentresInteretsVideException, ErreurChoixLangueException;
}


