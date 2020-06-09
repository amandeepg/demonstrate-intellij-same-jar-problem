package com.example;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.psi.PsiElement;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class SimpleLineMarkerProvider extends RelatedItemLineMarkerProvider {
    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element, @NotNull Collection<? super RelatedItemLineMarkerInfo<?>> result) {
        System.out.println(One.one());
        System.out.println(Two.two());
        super.collectNavigationMarkers(element, result);
    }
}
